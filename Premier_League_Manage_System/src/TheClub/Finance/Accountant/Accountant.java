/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheClub.Finance.Accountant;

import TheClub.Team.Team;
import TheSystem.Common.Person.Person;

/**
 *
 * @author Jiafeng
 */
public class Accountant extends Person{
    Team team;
    
    public Accountant(Team teamTemp) {
        this.team = teamTemp;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
