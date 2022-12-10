/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheClub.Team;

import TheClub.Finance.Accountant.Accountant;
import TheClub.Health.Doctor.Doctor;
import TheSystem.Common.Person.Person;
import java.util.ArrayList;
import java.sql.*; 

/**
 *
 * @author Jiafeng
 */
public class AccountantCatalog {
    ArrayList<Accountant> AccountantCata;
    
    public AccountantCatalog(Team teamTemp, Person personTemp) {
        this.AccountantCata = new ArrayList<Accountant>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/premierleague";
            String username = "root";
            String password = "abcd1234!";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM system_user_info WHERE "+
                         "club=\'"+personTemp.getClub()+"\' AND "+
                         "role_type=\'"+1+"\'"; //1 represent Accountant

            ResultSet resultSet = statement.executeQuery(sql);
            
            //作为中间变量，便于将变量导入对象中 需要知道在哪个企业 负责哪个角色 且所属club是哪个
            //As an intermediate variable, it is easy to import the variables into the object. 
            //You need to know which company is responsible for which role and which club you belong to.
            String userNameTemp = "";
            String passWordTemp = "";
            int enterpriseTypeTemp = 0;
            int roleTypeTemp = 0;
            String clubTemp = "";
            String nameTemp = "";
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
                nameTemp = resultSet.getString("name");
                genderTemp = resultSet.getInt("gender");
                ageTemp = resultSet.getInt("age");
                nationTemp = resultSet.getString("nation");
                addressTemp = resultSet.getString("address");
                zipTemp = resultSet.getString("zip");
                
                Accountant accountantTemp = new Accountant(teamTemp);
                
                accountantTemp.setUsername(userNameTemp);
                accountantTemp.setPassword(passWordTemp);
                accountantTemp.setEnterpriseType(enterpriseTypeTemp);
                accountantTemp.setRoleType(roleTypeTemp);
                accountantTemp.setClub(clubTemp);
                accountantTemp.setName(nameTemp);
                accountantTemp.setGender(genderTemp);
                accountantTemp.setAge(ageTemp);
                accountantTemp.setNation(nationTemp);
                accountantTemp.setAddress(addressTemp);
                accountantTemp.setZip(zipTemp);
                
                this.AccountantCata.add(accountantTemp);
                
//                System.out.println(playerTemp.getUsername() + " "+ playerTemp.getClub());//数据库测试点 核对数据正确与否 Database test points Verify data is correct or not
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        } 
    }

    public ArrayList<Accountant> getAccountantCata() {
        return AccountantCata;
    }

    public void setAccountantCata(ArrayList<Accountant> AccountantCata) {
        this.AccountantCata = AccountantCata;
    }

}
