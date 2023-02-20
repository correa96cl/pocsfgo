export default class Personas {
    constructor(config) {
        this.api = config.api;
        this.idTablaPersonas = config.idTablaPersonas
    }

    render(personas) {
        this.tablaPersonas = $(`#${this.idTablaPersonas}`).dataTable({
            data: personas,
            autoWidth: true,
            responsive: true,
            language: {
                url: `${this.api.getContext()}/DataTables/i18n/es-CL.json`,
            },
            columns: [
                {
                    data: "numeroDocumento",
                    render: (data, type, row) => {
                        return data;
                    }
                },
                {
                    data: "nombre",
                    render: (data, type, row) => {
                        return data;
                    }
                },
                {
                    data: 'apellidos',
                    render: (data, type, row) => {
                        return data;
                    }
                },
                {
                    data: 'pais',
                    render: (data, type, row) => {
                        return data;
                    }
                }
            ],
            dom: '<"datatable-header"fl><"datatable-scroll-wrap"t><"datatable-footer"ip>'
        });
    }
}