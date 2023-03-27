import React from "react";
import styles from "./styles/CountryButton.module.css";

interface CountryButtonProps {}

const CountryButton: React.FC<CountryButtonProps> = ({}) => {
  return (
    <button className={styles.button} data-testid="action-btn" id="action-btn">
      <p style={{ margin: 0 }}>Get country: </p>
    </button>
  );
};

export default CountryButton;
