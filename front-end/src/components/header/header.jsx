import { Link } from "react-router-dom";
import "./header.css";

function Header() {
  return (
    <header className="navbar px-3">
      <div className="gif-container">
        <img src="/src/assets/gif/logoo.gif" alt="logo" />
      </div>

      <div className="me-5">
        <Link className="linkNav link-dark text-decoration-none" to={"/home"}>
          Home
        </Link>

        <Link
          className="linkNav link-dark text-decoration-none"
          to={"/price-list"}
        >
          Listino Prezzi
        </Link>

        <Link
          className="linkNav link-dark text-decoration-none"
          to={"/beauty-center"}
        >
          Il Centro
        </Link>

        <Link
          className="linkNav link-dark text-decoration-none"
          to={"/contact"}
        >
          Contatti
        </Link>
      </div>
    </header>
  );
}
export default Header;
