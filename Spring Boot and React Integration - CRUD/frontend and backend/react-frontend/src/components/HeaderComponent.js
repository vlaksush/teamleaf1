import React, { Component } from 'react'

export default class HeaderComponent extends Component {
    render() {
        return (
            <div>
                <header>
                    <nav className="navbar narbar-expand-md navbar-dark bg-dark">
                        <div>
                            <a href="http://3edge.in" className="navbar-brand" >Employee Management Application</a>
                        </div>
                    </nav>
                </header>
            </div>
        )
    }
}
