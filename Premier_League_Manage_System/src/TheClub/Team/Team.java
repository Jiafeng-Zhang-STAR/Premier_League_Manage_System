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
import TheClub.Team.Player.Player;

import java.sql.*;

/**
 *
 * @author Jiafeng
 */
public class Team {
    Doctor doctor;
    ArrayList<Player> PlayerCata;
    
    public Team(Person personTemp) {
        this.doctor =new Doctor(this,personTemp);
        PlayerCata =new ArrayList<Player>(); //初始化面对对象的数组 Initialize object-facing arrays
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM system_user_info WHERE "+
                         "club=\'"+personTemp.getClub()+"\' AND "+
                         "role_type=\'"+4+"\'"; //4 represent player

            ResultSet resultSet = statement.executeQuery(sql);
            
            //作为中间变量，便于将变量导入对象中 需要知道在哪个企业 负责哪个角色 且所属club是哪个
            //As an intermediate variable, it is easy to import the variables into the object. 
            //You need to know which company is responsible for which role and which club you belong to.
            String userNameTemp = "";
            String passWordTemp = "";
            int enterpriseTypeTemp = 0;
            int roleTypeTemp = 0;
            String clubTemp = "";
            int genderTemp = 0;
            int ageTemp = 0;
            String nationTemp = "";
            String addressTemp = "";
            String zipTemp = "";
            
            while(resultSet.next()){
                
                userNameTemp = resultSet.getString("username");
                passWordTemp = resultSet.getString("password");
                enterpriseTypeTemp = resultSet.getInt("enterprise_type");
                roleTypeTemp = resultSet.getInt("role_type");
                clubTemp = resultSet.getString("club");
                genderTemp = resultSet.getInt("gender");
                ageTemp = resultSet.getInt("age");
                nationTemp = resultSet.getString("nation");
                addressTemp = resultSet.getString("address");
                zipTemp = resultSet.getString("zip");
                
                Player playerTemp = new Player();
                playerTemp.setUsername(userNameTemp);
                playerTemp.setPassword(passWordTemp);
                playerTemp.setEnterpriseType(enterpriseTypeTemp);
                playerTemp.setRoleType(roleTypeTemp);
                playerTemp.setClub(clubTemp);
                playerTemp.setGender(genderTemp);
                playerTemp.setAge(ageTemp);
                playerTemp.setNation(nationTemp);
                playerTemp.setAddress(addressTemp);
                playerTemp.setZip(zipTemp);
                
                this.PlayerCata.add(playerTemp);
                
                System.out.println(playerTemp.getUsername() + " "+ playerTemp.getClub());//数据库测试点 核对数据正确与否 Database test points Verify data is correct or not
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        } 
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public ArrayList<Player> getPlayerCata() {
        return PlayerCata;
    }

    public void setPlayerCata(ArrayList<Player> PlayerCata) {
        this.PlayerCata = PlayerCata;
    }
    
    
}


