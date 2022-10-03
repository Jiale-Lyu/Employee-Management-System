/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Jiale Lyu
 */
public class EmployeeHistory {
    private ArrayList<Employee> history;
    public EmployeeHistory(){
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

//    public void setHistory(ArrayList<Employee> history) {
//        this.history = history;
//    }
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        history.add(newEmployee);
        return newEmployee;
    }
    public Employee addNewEmployee(Employee newEmployee){
        history.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employee employee){
        history.remove(employee);
    }
    
    public void update(int index, Employee employee){
        history.get(index).setName(employee.getName());
        history.get(index).setEmployeeID(employee.getEmployeeID());
        history.get(index).setAge(employee.getAge());
        history.get(index).setGender(employee.getGender());
        history.get(index).setStartDate(employee.getStartDate());
        history.get(index).setLevel(employee.getLevel());
        history.get(index).setTeamInfo(employee.getTeamInfo());
        history.get(index).setTitle(employee.getTitle());
        history.get(index).setPhone(employee.getPhone());
        history.get(index).setEmail(employee.getEmail());
        history.get(index).setPhoto(employee.getPhoto());
    }
    
}
