import React, { Component } from 'react'
import EmployeeService from '../services/EmployeeService';

class ViewEmployeeComponent extends Component {
    constructor(props) {
        super(props);

        this.state = {
            id: this.props.match.params.id,
            employee: {}
        }
    }

    componentDidMount() {
        EmployeeService.getEmployeeById(this.state.id)
            .then((res) => {
                this.setState({
                    employee: res.data
                })
            })
    }

    render() {
        return (

            <div className="container">
                <br></br>
                <div className="row">
                    <h2>Employee Detail - {this.state.id}</h2>
                </div>
                <div className="row">
                    <table className="table table-bordered">
                        <tr>
                            <th>Firstname</th>
                            <td>{this.state.employee.firstName}</td>
                        </tr>

                        <tr>
                            <th>Lastname</th>
                            <td>{this.state.employee.lastName}</td>
                        </tr>

                        <tr>
                            <th>Email Id</th>
                            <td>{this.state.employee.emailId}</td>
                        </tr>
                    </table>
                </div>
            </div>
        )
    }
}
export default ViewEmployeeComponent;