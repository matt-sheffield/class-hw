function getRandomNumber() {
    return parseInt(Math.random()*10);
};

async function randomNum() {
    let promise = new Promise((resolve) => {
      setTimeout(() => resolve(getRandomNumber()), 500)
    });
  
    let result = await promise;
  
    console.log("\nRandom number is: " + result);
  }
  
randomNum();

async function whereAmI(city) {

    let url = "https://geocode.xyz/" + city + "?json=1";

    let geocode = await fetch(url);
    let geoResponse = await geocode.json();
    let latitude = geoResponse.latt;
    let longitude = geoResponse.longt;

    console.log("\n" + city + " is located at: \nlatitude: " + latitude + "\nlongitude: " + longitude);

}
whereAmI("Seattle");


setTimeout(function getCity1() {
    whereAmI("New York");
}, 1000)


setTimeout(function getCity1() {
    whereAmI("Phoenix");
}, 2000)