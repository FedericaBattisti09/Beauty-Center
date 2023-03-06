import "./footer.css";
import { CiLollipop } from "react-icons/ci";
import { CiMail } from "react-icons/ci";
import { CiHeart } from "react-icons/ci";

function Footer() {
  return (
    <footer className="d-flex justify-content-evenly py-2">
      <div className="footer-content">
        <h2 className="footerDescription">
          <CiHeart /> La Perla
        </h2>
        <p>
          Estetica "La Perla" è un angolo di relax e di benessere dove regna la
          manualità e la voglia di migliorare ogni giorno. Non è il classico
          Centro Estetico ma l'amore per la bellezza e l'arte dell'estetica!
        </p>
      </div>

      <div className="footer-content">
        <h2 className="footerDescription">
          <CiLollipop /> Dove siamo
        </h2>
        <p>Via Severo Carmignano 28 - 00151 Roma </p>
      </div>

      <div className="footer-content">
        <h2 className=" footerDescription">
          <CiMail /> Contatti
        </h2>
        <p>06/5525698 </p>
        <p>+39 3409831554 </p>
        <p>Estetica@laperla.com</p>
      </div>
    </footer>
  );
}
export default Footer;
