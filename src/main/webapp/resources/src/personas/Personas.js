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
                    data: "nombres",
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

        });

            this.tablaPersonas = $(`#${this.idTablaPersonas}`).editor({
                ajax: "../php/staff.php",
                table: `#${this.idTablaPersonas}`,
                fields: [{
                    label: "First name:",
                    name: "first_name"
                }, {
                    label: "Last name:",
                    name: "last_name"
                }, {
                    label: "Position:",
                    name: "position"
                }, {
                    label: "Office:",
                    name: "office"
                }, {
                    label: "Extension:",
                    name: "extn"
                }, {
                    label: "Start date:",
                    name: "start_date",
                    type: "datetime"
                }, {
                    label: "Salary:",
                    name: "salary"
                }
                ],
                dom: "Bfrtip",
                buttons: [
                    { text: "Crear", className: 'btn-light', editor: this.tablaPersonas},
                    { text:" Edita",   className: 'btn-light', editor: this.tablaPersonas },
                    { text: "Remover", className: 'btn-light', editor: this.tablaPersonas }
                ]
            });

            // Activate the bubble editor on click of a table cell
            $(`#${this.idTablaPersonas}`).on('click', 'tbody td:not(:first-child)', function (e) {
                this.tablaPersonas.bubble(this);
            });
    }

}