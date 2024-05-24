//login - sigup
signuppage = () => {
  login.style.display = 'none';
  signup.style.display = 'flex';
};
loginpage = () => {
  signup.style.display = 'none';
  login.style.display = 'flex';
};

//employee-user login
const btns = document.querySelectorAll('.btns');
const authsection = document.querySelectorAll('.authsection');

var slideNav = function (manual) {
  btns.forEach((btn) => {
    btn.classList.remove('active');
  });
  authsection.forEach((slide) => {
    slide.classList.remove('active');
  });

  btns[manual].classList.add('active');
  authsection[manual].classList.add('active');
};

btns.forEach((btn, i) => {
  btn.addEventListener('click', () => {
    slideNav(i);
  });
});

let map;

async function initMap() {
  // [START maps_add_map_instantiate_map]
  // The location of Uluru
  const position = { lat: -25.344, lng: 131.031 };
  // Request needed libraries.
  //@ts-ignore
  const { Map } = await google.maps.importLibrary("maps");
  const { AdvancedMarkerElement } = await google.maps.importLibrary("marker");

  // The map, centered at Uluru
  map = new Map(document.getElementById("map"), {
    zoom: 4,
    center: position,
    mapId: "DEMO_MAP_ID",
  });

  // [END maps_add_map_instantiate_map]
  // [START maps_add_map_instantiate_marker]
  // The marker, positioned at Uluru
  const marker = new AdvancedMarkerElement({
    map: map,
    position: position,
    title: "Uluru",
  });
  // [END maps_add_map_instantiate_marker]
}

initMap();