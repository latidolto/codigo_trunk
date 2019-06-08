import React from 'react';
import { Card, Button, InputGroup, FormControl } from 'react-bootstrap';
import { Redirect } from 'react-router-dom';
import { BrowserRouter, Switch, Route} from 'react-router-dom';

class Login extends React.Component {

  constructor() {
    super();
    this.renderRedirect = this.renderRedirect.bind(this);
    this.state = {
      usuario: null
    };
  }

  /*
  componentDidMount() {
    fetch('http://jsonplaceholder.typicode.com/users')
      .then(res => res.json())
      .then((data) => {
        this.setState({ contacts: data });
        alert(this.state.data);
      })
      .catch(console.log)
  }
  */

  

  render() {
    return (
      <div>
        <Card style={{ width: '18rem' }}>
          <Card.Body>
            <Card.Title>Iniciar Sesión</Card.Title>
            <InputGroup className="mb-3">
              <InputGroup.Prepend>
                <InputGroup.Text>@</InputGroup.Text>
              </InputGroup.Prepend>
              <FormControl
                placeholder="Correo Electrónico"
                aria-label="Correo"
                aria-describedby="basic-addon1" />
            </InputGroup>
            <InputGroup className="mb-3">
              <InputGroup.Prepend>
                <InputGroup.Text>T</InputGroup.Text>
              </InputGroup.Prepend>
              <FormControl
                placeholder="Contraseña"
                aria-label="Contraseña"
                aria-describedby="basic-addon1" />
            </InputGroup>

            
            
            <Button variant="primary" onClick={this.renderRedirect} >Redirect</Button>

          </Card.Body>
        </Card>
      </div>
    );
  }

  renderRedirect = () => {
    alert("Entre")
      return <Redirect to='/login' />
  }

  getUsuario() {
    fetch('http://jsonplaceholder.typicode.com/users')
      .then(res => res.json())
      .then((data) => {
        this.setState({ contacts: data });
        alert(this.state.data);
      })
      .catch(console.log)
  }

  postValue() {
    /* 
    fetch("POST", {
       method: 'POST',
       headers: new Headers({
         'Content-Type': 'application/x-www-form-urlencoded', // <-- Specifying the Content-Type
       }),
       body: "param1=value1&param2=value2" // <-- Post parameters
     })
       .then((response) => response.text())
       .then((responseText) => {
         alert(responseText);
       })
       .catch((error) => {
         console.error(error);
       });
       */
  }

}

export default Login;
