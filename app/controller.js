// establish the communication channel over a websocket
var ws = new WebSocket("ws://127.0.0.1:8080/stocks");
 
// called when socket connection established
ws.onopen = function() {
	console.log("WHAT WHAT!!!");
};
  
// called when socket connection closed
ws.onclose = function() {
    console.log("disconnected!!!");
};
 
// called in case of an error
ws.onerror = function(err) {
    console.log("ERROR!", err )
};
 
// sends msg to the server over websocket
function sendToServer(msg) {
    ws.send(msg);
}