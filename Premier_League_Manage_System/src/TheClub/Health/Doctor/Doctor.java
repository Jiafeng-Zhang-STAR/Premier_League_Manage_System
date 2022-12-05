/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheClub.Health.Doctor;

import TheSystem.Common.Person.Person;
//导入Common的个人原始信息类 Import Common's personal original information class
import TheClub.Team.Team;
//
import java.sql.*; 
/**
 *
 * @author Jiafeng
 */
public class Doctor extends Person{
    Team team;
    
    public Doctor(Team teamTemp) {
        
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/premierleague";
//            String username = "root";
//            String password = "abcd1234!";
//            Connection connection = DriverManager.getConnection(url, username, password);
//            Statement statement = connection.createStatement();
//            
//            String sql = "SELECT * FROM system_user_info WHERE "+
//                         "club=\'"+doctorClubTemp+"\' AND "+
//                         "role_type=\'"+2+"\'"; //4 represent doctor
//
//            ResultSet resultSet = statement.executeQuery(sql);
//            
//            //作为中间变量，便于将变量导入对象中 需要知道在哪个企业 负责哪个角色 且所属club是哪个
//            //As an intermediate variable, it is easy to import the variables into the object. 
//            //You need to know which company is responsible for which role and which club you belong to.
//            String userNameTemp = "";
//            String passWordTemp = "";
//            int enterpriseTypeTemp = 0;
//            int roleTypeTemp = 0;
//            String clubTemp = "";
//            int genderTemp = 0;
//            int ageTemp = 0;
//            String nationTemp = "";
//            String addressTemp = "";
//            String zipTemp = "";
//            
//            while(resultSet.next()){
//                
//                userNameTemp = resultSet.getString("username");
//                passWordTemp = resultSet.getString("password");
//                enterpriseTypeTemp = resultSet.getInt("enterprise_type");
//                roleTypeTemp = resultSet.getInt("role_type");
//                clubTemp = resultSet.getString("club");
//                genderTemp = resultSet.getInt("gender");
//                ageTemp = resultSet.getInt("age");
//                nationTemp = resultSet.getString("nation");
//                addressTemp = resultSet.getString("address");
//                zipTemp = resultSet.getString("zip");
//                
//                this.setUsername(userNameTemp);
//                this.setPassword(passWordTemp);
//                this.setEnterpriseType(enterpriseTypeTemp);
//                this.setRoleType(roleTypeTemp);
//                this.setClub(clubTemp);
//                this.setGender(genderTemp);
//                this.setAge(ageTemp);
//                this.setNation(nationTemp);
//                this.setAddress(addressTemp);
//                this.setZip(zipTemp);
//                
//            }
//        }
//        catch(ClassNotFoundException | SQLException e)
//        {
//            e.printStackTrace();
//        } 
        
        this.team = teamTemp;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
}
