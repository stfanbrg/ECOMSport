package com.MPGI.ECOMSport.MgrBean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.MPGI.ECOMSport.EJBentity.Article;
import com.MPGI.ECOMSport.EJBentity.Theme;
import com.MPGI.ECOMSport.EJBsession.ThemeDao;


@ManagedBean(name = "themeController")
@RequestScoped
public class ThemeController {


    @EJB
    private ThemeDao themeDao;

    @PostConstruct
    public void init() {
    	Theme theme = new Theme();
    }

    public List<Theme> getAllThemes() {

        return themeDao.findAll();
    }

    public void saveTheme(Theme newTheme) {
        System.out.println(themeDao);
        themeDao.save(newTheme);
    }

    public Theme readTheme(int idTheme) {
        return themeDao.findById(idTheme);
    }
}