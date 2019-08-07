package apiBeans;

import java.util.List;

public class EmployeesResponse {

  private List<EmployeeResponse> employees;

    public List<EmployeeResponse> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeResponse> employees) {
        this.employees = employees;
    }
}
