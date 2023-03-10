export default class Paises {
    constructor(config) {
        this.api = config.api;
        this.idTablaPaises = config.idTablaPaises
    }

    render(paises) {
        this.tablaPaises = $(`#${this.idTablaPaises}`).dataTable({
            data: paises,
            autoWidth: true,
            responsive: true,
            language: {
                url: `${this.api.getContext()}/DataTables/i18n/es-CL.json`,
            },
            columns: [
                {
                    data: "id",
                    render: (data, type, row) => {
                        return data;
                    }
                },
                {
                    data: "nombre",
                    render: (data, type, row) => {
                        return data;
                    }
                }
            ],
            dom: '<"datatable-header"fl><"datatable-scroll-wrap"t><"datatable-footer"ip>'
        });
    }
}
