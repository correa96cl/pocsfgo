const path = require('path');

module.exports = {
    mode: 'development',
    devtool: 'cheap-module-source-map',
    entry: {
        paises: './src/main/webapp/resources/src/paises/App.js',
        personas: './src/main/webapp/resources/src/personas/App.js'

    },
    output: {
        path: path.resolve(__dirname, 'src', 'main', 'resources', 'static'),
        filename: '[name]/app.bundle.js'
    },
    module: {
        rules: [{
            test: /\.m?js$/,
            exclude: /(node_modules)/,
            use: {
                loader: 'babel-loader',
                options: {
                    presets: ['@babel/preset-env']
                }
            }
        },
        {
            test: /\.css$/,
            use: ["style-loader", "css-loader"]
        }]
    }

};
