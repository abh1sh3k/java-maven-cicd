package com.sampleapp;

import com.sampleapp.model.ProgramType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectprogramservlet",
        urlPatterns = "/SelectProgram"
)
public class SelectProgramServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String programType = req.getParameter("Type");

        ProgramService programService = new ProgramService();
        ProgramType p = ProgramType.valueOf(programType);

        List programBooks = programService.getAvailableBooks(p);

        req.setAttribute("books", programBooks);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
