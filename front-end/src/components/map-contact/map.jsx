import React from "react";
import "./map.css";

const Map = () => {
  return (
    <div className="d-flex align-items-center flex-column my-5">
      <div className="title-map">
        <h2>Dove ci troviamo</h2>
      </div>

      <div className="mapouter">
        <div className="gmap_canvas">
          <iframe
            title="Google Map"
            id="gmap_canvas"
            src="https://maps.google.com/maps?q=Via%20Severo%20Carmignano%2028%20-%2000151%20Roma&t=&z=15&ie=UTF8&iwloc=&output=embed"
            //E'deprecato perché non si usa più
            frameBorder="0"
          />
        </div>
      </div>
    </div>
  );
};

export default Map;

/*E' stato aggiunto l'attributo title per motivi di accessibilità.*/
