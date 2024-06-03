var express = require('express');
var app = express();

app.set("view engine","pug");

app.get("/credit_cards",function (req,res) {
    var requestJSON = "";
    var number = Math.floor(Math.random()*3)+1;
    if(number == 1){
        requestJSON = {"id":4885,"uid":"0e05163f-c01e-4c0f-9034-d7720afa4b3e","credit_card_number":"1211-1221-1234-2201","credit_card_expiry_date":"2025-06-01","credit_card_type":"switch"};
    }else if(number == 2){
        requestJSON = {"id":1234,"uid":"0e05163f-c01e-4c0f-9034-d7720afa4b3e","credit_card_number":"1771-1221-7774-8888","credit_card_expiry_date":"2025-06-07","credit_card_type":"switch"};
    }else{
        requestJSON = {"id":1234,"uid":"0e05163f-c01e-4c0f-9034-d7720afa4b3e","credit_card_number":"1771-1221-7774-8888","credit_card_expiry_date":"2025-06-09","credit_card_type":"switch"};
    }

    res.json(requestJSON)
});

var server = app.listen(7885,function () {
    var host = server.address().address;
    var port = server.address().port;

    console.log("应用实例，访问地址为 http://%s:%s",host,port)
    
})