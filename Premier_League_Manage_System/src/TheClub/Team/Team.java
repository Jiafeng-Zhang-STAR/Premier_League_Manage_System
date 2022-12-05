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
    PlayerCatalog playerCatalog;
    DoctorCatalog doctorCatalog;
    
    public Team(Person personTemp) {
        this.doctorCatalog = new DoctorCatalog(this,personTemp);
//        this.doctor =new Doctor(this,personTemp.getClub());
        this.playerCatalog=new PlayerCatalog(this,personTemp);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public PlayerCatalog getPlayerCatalog() {
        return playerCatalog;
    }

    public void setPlayerCatalog(PlayerCatalog playerCatalog) {
        this.playerCatalog = playerCatalog;
    }

    public DoctorCatalog getDoctorCatalog() {
        return doctorCatalog;
    }

    public void setDoctorCatalog(DoctorCatalog doctorCatalog) {
        this.doctorCatalog = doctorCatalog;
    }
    
    

}


