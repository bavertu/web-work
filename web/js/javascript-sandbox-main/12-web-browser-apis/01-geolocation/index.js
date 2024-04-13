// getCurrentPosition();

function curSuccess(pos) {
  const coords = pos.coords;

  console.log(`Latitide: ${coords.latitude}`);
  console.log(`Longitude: ${coords.longitude}`);
  console.log(`Within: ${coords.accuracy} meters`);
}

function curError(err) {
  console.log(`Error: ${err.code} - ${err.message}`);
}

const curOptions = {
  enableHighAccuracy: true, // Use GPS if available
  timeout: 5000, // Time to wait to stop trying for location
  maximumAge: 0, // Do not use a cached position
};

// navigator.geolocation.getCurrentPosition(curSuccess, curError, curOptions);

// watchPostion();

const target = {
  latitude: 41.234322,
  longitude: -71.12322,
};

function watchSuccess(pos) {
  const coords = pos.coords;
  console.log(coords);

  if (
    target.latitude === coords.latitude &&
    target.longitude === coords.longitude
  ) {
    console.log('You have reached your destination!');
    navigator.geolocation.clearWatch(id);
  }
}

function watchError(err) {
  console.log(`Error: ${err.code} - ${err.message}`);
}

const watchOptions = {
  enableHighAccuracy: true, // use gps if avaliable
  timeout: 5000, // time to wait to stow trying for location
  maximumAge: 0, // do not use a cached position
};

const id = navigator.geolocation.watchPosition(
  watchSuccess,
  watchError,
  watchOptions
);
