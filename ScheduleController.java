/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.eHealth.controller;

import com.iut.eHealth.dao.Doctorinfo_1Facade;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iut.eHealth.entity.AppointmentInfo;
import com.iut.eHealth.entity.DoctorInfo;
import com.iut.eHealth.entity.PatientInfo;
import com.iut.eHealth.entity.StatelessSchedule;
import com.iut.eHealth.service.ScheduleService;
import javax.ejb.EJB;

@Controller
@RequestMapping("/")
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;
     
	
	@RequestMapping("/")
	public String homepage(Model theModel) {
		
		return "homepage";
	}
	
	@RequestMapping("/doctorList")
	public String doctorList(Model theModel) {
		
		List<DoctorInfo> doctors = scheduleService.getDoctors();
		
		theModel.addAttribute("doctors",doctors);
		
		return "doctorList";
		
	}
	
	
	
	
	@RequestMapping("/scheduleList")
	public String ScheduleList(Model theModel,
			@RequestParam(value="id", required=false) String id,HttpSession session) {
		
		session.setAttribute("doctorId", id);
		
		int d_id = Integer.parseInt(id);
		
		//DoctorInfo doctor =  scheduleService.getDoctor(id);
		List<DoctorInfo> doctor = scheduleService.getDoctors();	
		
		DoctorInfo temp = new DoctorInfo();
		
		for(int i=0;i<doctor.size();i++) {
			String doc_id = Integer.toString(doctor.get(i).getId());
			//System.out.println(doc_id);
			//System.out.println("******"+id);
			if(doc_id.equals(id)) {
				temp = doctor.get(i);
			}
		}
		
		//System.out.println("#####"+temp.getId()+"  "+temp.getName()+" "+temp.getDegree()+" "+temp.getDivision());
		
		theModel.addAttribute("doctors",temp);
		
		//Debugged
		
		List<StatelessSchedule> schedule = scheduleService.getSchedule();
		
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String strDate = dateFormat.format(date);
		
		List<AppointmentInfo>appointments = scheduleService.getAppointmentInfo(d_id);
		
		System.out.println("Date is - "+strDate+"++++++++++++++++++++++++++++++++++++++++++++++");
		
		/*for(int i=0;i<appointments.size();i++) {
			System.out.println(appointments.get(i).toString());
		}*/
		
		System.out.println(appointments.size());
		for(int i=0;i<appointments.size();i++) {
			System.out.println(appointments.get(i).toString());
		}
		
		for(int i=0;i<schedule.size();i++) {
		
			for(int j=0;j<appointments.size();j++) {
				//System.out.println("startTime - "+schedule.get(i).getStartTime()+" **startTime - "+appointments.get(j).getStartTime()+"  Date"+strDate+" **Dates"+appointments.get(j).getDate());
				
				//System.out.println(appointments.get(j).getStartTime().equals(schedule.get(i).getStartTime())+"~~~~~~~~~~");
				//System.out.println("true".equals("true")+"################");
				
				String str1 = appointments.get(j).getStartTime().trim();
				String str2 = schedule.get(i).getStartTime().trim();
				
				String checkDate1 = appointments.get(j).getDate().trim();
				strDate = strDate.trim();
				
				//System.out.println(str1.equals(str2));
				System.out.println(strDate+"---"+checkDate1+"        -------------------");
				
				if(str1.equals(str2) && strDate.equals(checkDate1)) {
					//System.out.println("******");
					schedule.get(i).setFlag(true);
				}
				
			
			}
		}
		
		/*for(int i=0;i<schedule.size();i++) {
			System.out.println("##****"+schedule.get(i).isFlag());
		}*/
		
		
		
		theModel.addAttribute("schedule",schedule);
		
		return "schedule-list";
		
		}
	
	@RequestMapping("/appointmentBooking")
	public String BookingInfo(Model theModel,
			@RequestParam("startTime") String startTime,
			@RequestParam("endTime") String endTime, HttpSession session) {
		
		String loggedIn = (String) session.getAttribute("loggedIn");
		
		if("true".equals(loggedIn))
		{
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			String strDate = dateFormat.format(date);
			
			System.out.println("Date is - "+strDate);
			
			AppointmentInfo appointments = new AppointmentInfo();
			
			int id = Integer.parseInt((String) session.getAttribute("doctorId"));
			
			//System.out.println("id = "+id);
			
			appointments.setDoctorId(id);
			appointments.setPatientId(101);
			appointments.setStartTime(startTime);
			appointments.setEndTime(endTime);
			appointments.setDate(strDate);
			
			scheduleService.setAppointmentInfo(appointments);
			
			//theModel.addAttribute("appointments",appointments);
			
			String test = (String) session.getAttribute("doctorId");
			
			return "forward:/scheduleList?id="+id;
		}
		else
		{
			return "forward:/logIn";
		}
		
	}
	
	@RequestMapping("signIn")
	public String signIn(Model theModel)
	{
		PatientInfo patient = new PatientInfo();
		
		theModel.addAttribute("patient", patient);
		
		return "signIn";
	}
	
	@RequestMapping("savePatient")
	public String savePatient(@ModelAttribute("patient") PatientInfo thePatient,
							Model theModel,HttpSession session)
	{
		boolean flag = scheduleService.checkPatient(thePatient.getEmail());
		
		if(flag==false) {
			scheduleService.savePatient(thePatient);

			session.setAttribute("loggedIn", "true");
			session.setAttribute("patientId", thePatient.getId());
			session.setAttribute("signInFailed", "false");
			return "redirect:/";
		}
		else {
			session.setAttribute("signInFailed", "true");
			return "forward:/signIn";
		}
		
		
	}
	
	@RequestMapping("logIn")
	public String logIn(Model theModel)
	{
		
		return "logIn";
	}
	
	@RequestMapping("verifyPatient")
	public String verifyPatient(Model theModel,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			HttpSession session)
	{
		
		int id = scheduleService.verifyPatient(email,password);
		
		if(id==-1)
		{
			session.setAttribute("loggedIn", "false");
			theModel.addAttribute("loginFailed","true");
			return "forward:/logIn";
		}
		else
		{
			session.setAttribute("loggedIn", "true");
			theModel.addAttribute("loginFailed","false");
			PatientInfo thePatient = scheduleService.getPatient(id);
			session.setAttribute("patientId", thePatient.getId());
			return "forward:/";
		}
	}

}
