/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheClub.Team;

import java.util.ArrayList;
//导入专用于ArrayList的类 Import dedicated to ArrayList class
import TheSystem.Common.Person.Person;
//导入Common的个人原始信息类 Import Common's personal original information class
import TheClub.Finance.Accountant.Accountant;
import TheClub.Health.Doctor.Doctor;

/**
 *
 * @author Jiafeng
 */
public class Team {
    Doctor doctor;
    
    public Team(Person personTemp) {
        this.doctor =new Doctor(this,personTemp);
    }
}


