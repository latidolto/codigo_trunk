import React, { Component } from 'react'

class Service extends Component {

    constructor() {
        super();
        this.state = {
            users: []
        }
    }

    componentWillMount() {
        fetch('https://randomuser.me/api/?results=50')
            .then(response => response.json())
            .then(users => {
                users.results.forEach(user => {
                    let data = {
                        name: user.name.first,
                        email: user.email,
                        password: user.login.password
                    }
                    this.setState({ users: this.state.users.concat([data]) });
                });
            });
    }

    render() {
        console.log(this.state.users.length)
        return (
            <h1>A</h1>
        );
    }

} export default Service;
