import React from "react";
import { render, screen } from "@testing-library/react";
import "@testing-library/jest-dom";
import CountryButton from "../components/CountryButton";

describe("CountryButton", () => {
  test('renders button with "Get country:" text', () => {
    render(<CountryButton />);
    const button = screen.getByTestId("action-btn");
    expect(button).toBeInTheDocument();
    expect(button).toHaveTextContent(/^Get country:/);
  });

  test("button has correct className", () => {
    render(<CountryButton />);
    const button = screen.getByTestId("action-btn");
    expect(button).toHaveClass("button");
  });
});
