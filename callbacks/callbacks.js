
// Adding content into the html doc, made it take 2 arguments to decrease code. First argument is the targeted element id, the second is the code the user wants to populate within that element
function addHtml(elementId, code) {
    // Need to have quotes around the element id in the next line. This line will add the quotes around the elementId and populate the next line in proper format
    id = '"' + elementId + '"';
    // Takes in the elementId argument that the functions below will use in order to target which element to add html in, then takes in the code the user wants to add within that targeted element
    document.getElementById(elementId).innerHTML = code;
}

// Wait 1 second, then display the first dot
setTimeout(function waitOneSecond() {
    addHtml("wait1",".");
}, 1000)

// Wait 1 second, then display the second dot
setTimeout(function waitTwoSeconds() {
    addHtml("wait2",".");
}, 2000)

// Wait 1 second, then display the third dot
setTimeout(function waitThreeSeconds() {
    addHtml("wait3",".");
}, 3000)

// Wait 1 second, then complete legendary!
setTimeout(function waitFourSeconds() {
    addHtml("wait4","...ary!");
}, 4000)