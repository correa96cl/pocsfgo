import BaseApi from "../commons/BaseApi";

export default class Api extends BaseApi {
    constructor(config) {
        super(config)
        this.baseEndpoint = `${config.context}/rest/personas`;
    }

    #getBaseEndPoint() {
        return this.baseEndpoint;
    }

    obtenerPersonas() {
        const url = this.#getBaseEndPoint();
        return this.get(url);
    }

    insertarPersonas(){
        const url = this.#getBaseEndPoint();
        return this.post(url);
    }

    deletePersonas(){
        const url = this.#getBaseEndPoint();
        return this.delete(url);
    }

    updatePersonas(){
        const url = this.#getBaseEndPoint();
        return this.put(url);
    }


}