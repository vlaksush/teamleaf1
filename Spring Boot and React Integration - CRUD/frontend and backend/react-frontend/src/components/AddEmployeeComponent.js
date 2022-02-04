import React, { Component } from 'react'
import EmployeeService from '../services/EmployeeService';

class AddEmployeeComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: this.props.match.params.id,
            firstName: '',
            lastName: '',
            emailId: ''
        }

        this.ChangeFirstNameHandler = this.ChangeFirstNameHandler.bind(this);
        this.ChangeLastNameHandler = this.ChangeLastNameHandler.bind(this);
        this.ChangeEmailIdHandler = this.ChangeEmailIdHandler.bind(this);
    }

    ChangeFirstNameHandler = (event) => {
        this.setState({
            firstName: event.target.value
        })
    }

    ChangeLastNameHandler = (event) => {
        this.setState({
            lastName: event.target.value
        })
    }

    ChangeEmailIdHandler = (event) => {
        this.setState({
            emailId: event.target.value
        })
    }

    saveOrUpdateEmployee = (e) => {
        e.preventDefault();
        let employee = {
            firstName: this.state.firstName,
            lastName: this.state.lastName,
            emailId: this.state.emailId
        }


        if (this.state.id === '_add') {
            EmployeeService.addEmployee(employee)
                .then((res) => {
                    this.props.history.push("/employees")
                });
        }
        else {
            EmployeeService.updateEmployee(employee, this.state.id)
                .then((res) => {
                    this.props.history.push('/employees')
                });
        }
    }


    componentDidMount() {
        if (this.state.id === '_add') {
            return
        }
        else {
            EmployeeService.getEmployeeById(this.state.id)
                .then((res) => {
                    let employee = res.data;
                    this.setState({
                        firstName: employee.firstName,
                        lastName: employee.lastName,
                        emailId: employee.emailId
                    })
                })
        }
    }

    cancel() {
        this.props.history.push('/employees');
    }

    getTitle() {
        if (this.state.id === '_add') {
            return <h2 className="text-center">Add Employee</h2>
        }
        else {
            return <h2 className="text-center">Update Employee</h2>
        }
    }

    render() {
        return (
            <div>
                <br /><br />
                <div class="container">
                    <div className="row">
                        <div className="card col-md-6 offset-md-3 offset-md-3">

                            {
                                this.getTitle()
                            }

                            <div className="card-body">
                                <form>
                                    <div className="form-group">
                                        <label>Firstname</label>
                                        <input type="text" placeholder="Enter firstname"
                                            name="firstName" className="form-control"
                                            value={this.state.firstName}
                                            onChange={this.ChangeFirstNameHandler} />
                                    </div>

                                    <div className="form-group">
                                        <label>Lastname</label>
                                        <input type="text" placeholder="Enter lastname"
                                            name="lastName" className="form-control"
                                            value={this.state.lastName}
                                            onChange={this.ChangeLastNameHandler} />
                                    </div>

                                    <div className="form-group">
                                        <label>Email Id</label>
                                        <input type="text" placeholder="Enter Email"
                                            name="emailId" className="form-control"
                                            value={this.state.emailId}
                                            onChange={this.ChangeEmailIdHandler} />
                                    </div>

                                    <button className="btn btn-success" onClick={this.saveOrUpdateEmployee}>Save</button>
                                    <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{ marginLeft: "10px" }}>Cancel</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>


            </div>
        )
    }
}

export default AddEmployeeComponent;