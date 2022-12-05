/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheClub.Team.Player;
import TheClub.Team.Team;
import TheSystem.Common.Person.Person;
//导入Common的个人原始信息类 Import Common's personal original information class
/**
 *
 * @author Jiafeng
 */
public class Player extends Person{
    Team team;
    
    public Player(Team teamTemp) {
        this.team = teamTemp;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
