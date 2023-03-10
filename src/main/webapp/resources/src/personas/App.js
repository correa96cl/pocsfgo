import Api from "./Api";
import Personas from "./Personas";
import { showError } from "../commons/Utils";

export default class App {
    constructor(config) {
        this.api = new Api(config);

        this.personas = new Personas({ idTablaPersonas: 'personas', api: this.api, ...config });

        this.renderPersonas();
    }

    renderPersonas() {
        this.api.obtenerPersonas()
            .then(personas => {
                this.personas.render(personas);
            })
            .catch (error => {
                console.log(error);
                showError(error);
            });
    }
}

globalThis.app = new App(config);