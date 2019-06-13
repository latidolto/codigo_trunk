import React, { Component } from 'react'
import New from './New';

class NewsService extends Component {

    constructor() {
        super();
        this.state = {
            news: []
        }
    }

    componentWillMount() {
        fetch('http://localhost:8080/LTO_NewsWS/rest/News')
            .then(response => response.json())
            .then(news => {
                news.List.forEach(mNew => {
                    let data = {
                        notId: mNew.notId,
                        autId: mNew.autId,
                        notTitulo: mNew.notContenido,
                        notSubtitulo: mNew.notSubtitulo,
                        notFecha: mNew.notFecha,
                        notVisitas: mNew.notVisitas,
                        notContenido: mNew.notContenido,
                        categorias: mNew.categorias,
                        imagenes: mNew.imagenes,
                        tags: mNew.tags,
                        comentarios: mNew.comentarios
                    }
                    this.setState({ news: this.state.news.concat([data]) });
                });
            });
    }

    render() {
        console.log(this.state.news.length)
        return (
            <div>
                {
                    this.state.news.map(mNew => <New key={mNew.notId} titulo={mNew.notTitulo} />)
                }
            </div>
        );
    }

} export default NewsService;
