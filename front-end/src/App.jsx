import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import "./App.css";
import Home from "./pages/home/home";
import Contact from "./pages/contact/contact";
import PriceList from "./pages/price-list/price-list";
import Header from "./components/header/header";
import Footer from "./components/footer/footer";
import NotFound from "./pages/notFound/not-found";
import BeautyCenter from "./pages/beauty-center/beauty-center";

function App() {
  return (
    // Router memorizza la posizione corrente nella barra degli indirizzi del browser utilizzando URL
    <Router>
      <Header />

      <div className="pageContainer">
        {/* Routes crea applicazioni web a pagina singola */}

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/home" element={<Home />} />
          <Route path="/price-list" element={<PriceList />} />
          <Route path="/beauty-center" element={<BeautyCenter />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="*" element={<NotFound />} />
        </Routes>
      </div>

      <Footer />
    </Router>
  );
}

export default App;
