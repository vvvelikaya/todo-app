//package com.kpi.project.todoapp.service;
//
////import com.kpi.project.todoapp.dao.RoleDAOImpl;
//import com.kpi.project.todoapp.dao.UserDAO;
//import com.kpi.project.todoapp.dao.UserDAOImpl;
//import com.kpi.project.todoapp.model.UserItem;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.core.GrantedAuthority;
////import org.springframework.security.core.authority.SimpleGrantedAuthority;
////import org.springframework.security.core.userdetails.User;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserDetailsServiceImp implements UserDetailsService {
//
//    @Autowired
//    private UserDAOImpl userDAO;
//   // @Autowired
//    //private RoleDAOImpl roleDAO;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//
//        User user = userDAO.getUserByEmail(userName);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//
//        return user;

//        UserItem user = this.userDAO.getUserByEmail(userName);
//
//        if (user == null) {
//            System.out.println("User not found! " + userName);
//            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
//        }

//        System.out.println("Found User: " + user);
//
//        // [ROLE_USER, ROLE_ADMIN,..]
//        List<String> roleNames = this.roleDAO.getRoleNames(user.getId());
//
//        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
//        if (roleNames != null) {
//            for (String role : roleNames) {
//                // ROLE_USER, ROLE_ADMIN,..
//                GrantedAuthority authority = new SimpleGrantedAuthority(role);
//                grantList.add(authority);
//            }
//        }
//
//        UserDetails userDetails = (UserDetails) new User(user.getEmail(), //
//                user.getPassword());
//
//        return userDetails;
//    }
//}
