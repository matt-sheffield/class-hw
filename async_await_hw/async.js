/*
DONE Write an asynchronous function and call it with async/await
DONE Write function called getRandomNumber that returns a promise
DONE In the promise, write a setTimeout() that will resolve the promise with a random number after .5 seconds
DONE Write an async function that invokes the getRandomNumber function, awaiting the random number, and printing that to the console.
DONE Invoke your async function


DONE Fetch remote data using async/await
DONE Write an asynchronous function that accepts 1 parameter
DONE A city name
DONE When invoked, this function should use geocode.xyz's API retrieve the city data, which uses a URL formatted as follows:

https://geocode.xyz/seattle?json=1

Once retrieved, print to the console the latitude and longitude
Invoke your async function with a few cities as a test
*/

//====================================================================

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