/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheClub.Health.Doctor;

import TheSystem.Common.Person.Person;
//导入Common的个人原始信息类 Import Common's personal original information class
import TheClub.Team.Team;
//

/**
 *
 * @author Jiafeng
 */
public class Doctor extends Person{
    Team team;
    
    public Doctor(Team teamTemp, Person personTemp) {
        this.team = teamTemp;
        this.setUsername(personTemp.getUsername());
        this.setPassword(personTemp.getPassword());
        this.setEnterpriseType(personTemp.getEnterpriseType());
        this.setRoleType(personTemp.getRoleType());
        this.setClub(personTemp.getClub());
        this.setGender(personTemp.getGender());
        this.setAge(personTemp.getAge());
        this.setNation(personTemp.getNation());
        this.setAddress(personTemp.getAddress());
        this.setZip(personTemp.getZip());
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
}
