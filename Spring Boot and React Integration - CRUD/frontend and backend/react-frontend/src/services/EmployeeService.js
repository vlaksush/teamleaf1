import axios from 'axios';

const BASE_URL = "http://localhost:8081/api/v1/employees"
class EmployeeService {
    getEmployees() {
        return axios.get(BASE_URL);
    }

    addEmployee(employee) {
        return axios.post(BASE_URL, employee);
    }

    updateEmployee(employee, employeeId) {
        return axios.put(BASE_URL + '/' + employeeId, employee);
    }

    getEmployeeById(employeeId) {
        return axios.get(BASE_URL + '/' + employeeId);
    }

    deleteEmployee(employeeId) {
        return axios.delete(BASE_URL + '/' + employeeId);
    }

}

export default new EmployeeService();