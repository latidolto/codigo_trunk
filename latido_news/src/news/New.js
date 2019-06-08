import React, { Component } from 'react'

class New extends Component {

    render() {
        return (
            <h1>Componente de Noticia: {this.props.mNew.notContenido }</h1>
        );
    }

} export default New;