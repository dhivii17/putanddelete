package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo stRepo;

	public List<Student> getDetails()
	{
		return stRepo.findAll();
	}
	public 	Student SaveDetails(Student e)
	{
		return stRepo.save(e);
	}
	public Student updateDetails(Student e1)
	{
		return stRepo.saveAndFlush(e1);
	}
    public void deleteDetails(int id)
    {
    	stRepo.deleteById(id);
    }
}
