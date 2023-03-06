import ListServicesMassage from "../../components/list-services/massage/list-services-massage";
import ListServicesFace from "../../components/list-services/face/list-services-face";
import ListServicesBody from "../../components/list-services/body/list-services-body";
import ListServicesSolarium from "../../components/list-services/solarium/list-services-solarium";
import PromoUomo from "../../components/promo-card/promoMan/promo-uomo";
import PromoDonna from "../../components/promo-card/promoWoman/promo-donna";
import PromoCoppia from "../../components/promo-card/promoCouple/promo-coppia";
import "./price-list.css";

function PriceList() {
  return (
    <>
      <div className="title-price-list text-center">
        <h2>LISTINO PREZZI</h2>
      </div>

      <div className="list-services d-flex justify-content-center">
        <div>
          <h2>Viso</h2>
          <ListServicesFace />
          <h2>Solarium</h2>
          <ListServicesSolarium />
        </div>

        <div>
          <h2>Corpo</h2>
          <ListServicesBody />
          <h2>Massaggi</h2>
          <ListServicesMassage />
        </div>
      </div>

      <div className="title-promo text-center">
        <h2>LE NOSTRE SUPER PROMO DA NON PERDERE!</h2>
      </div>

      <div className="d-flex gap-5 justify-content-center my-5">
        <PromoUomo />
        <PromoDonna />
        <PromoCoppia />
      </div>
    </>
  );
}
export default PriceList;
