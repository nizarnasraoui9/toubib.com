package com.toubibnet.toubibnet.mapper;

import com.toubibnet.toubibnet.dto.UserDto;
import com.toubibnet.toubibnet.model.Appointment;
import com.toubibnet.toubibnet.model.Question;
import com.toubibnet.toubibnet.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-27T19:29:59+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class UserMaperImpl implements UserMaper {

    @Override
    public List<UserDto> toDtos(List<User> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( dtos.size() );
        for ( User user : dtos ) {
            list.add( toDto( user ) );
        }

        return list;
    }

    @Override
    public List<User> toBos(List<UserDto> bos) {
        if ( bos == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( bos.size() );
        for ( UserDto userDto : bos ) {
            list.add( toBo( userDto ) );
        }

        return list;
    }

    @Override
    public UserDto toDto(User bo) {
        if ( bo == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( bo.getId() );
        userDto.setFirstName( bo.getFirstName() );
        userDto.setLastName( bo.getLastName() );
        userDto.setEmail( bo.getEmail() );
        userDto.setPhoneNumber( bo.getPhoneNumber() );
        List<Appointment> list = bo.getAppointments();
        if ( list != null ) {
            userDto.setAppointments( new ArrayList<Appointment>( list ) );
        }
        List<Question> list1 = bo.getQuestionList();
        if ( list1 != null ) {
            userDto.setQuestionList( new ArrayList<Question>( list1 ) );
        }

        return userDto;
    }

    @Override
    public User toBo(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setFirstName( dto.getFirstName() );
        user.setLastName( dto.getLastName() );
        user.setEmail( dto.getEmail() );
        user.setPhoneNumber( dto.getPhoneNumber() );
        List<Appointment> list = dto.getAppointments();
        if ( list != null ) {
            user.setAppointments( new ArrayList<Appointment>( list ) );
        }
        List<Question> list1 = dto.getQuestionList();
        if ( list1 != null ) {
            user.setQuestionList( new ArrayList<Question>( list1 ) );
        }

        return user;
    }

    @Override
    public User fillBo(UserDto dto, User bo) {
        if ( dto == null ) {
            return null;
        }

        bo.setId( dto.getId() );
        bo.setFirstName( dto.getFirstName() );
        bo.setLastName( dto.getLastName() );
        bo.setEmail( dto.getEmail() );
        bo.setPhoneNumber( dto.getPhoneNumber() );
        if ( bo.getAppointments() != null ) {
            List<Appointment> list = dto.getAppointments();
            if ( list != null ) {
                bo.getAppointments().clear();
                bo.getAppointments().addAll( list );
            }
            else {
                bo.setAppointments( null );
            }
        }
        else {
            List<Appointment> list = dto.getAppointments();
            if ( list != null ) {
                bo.setAppointments( new ArrayList<Appointment>( list ) );
            }
        }
        if ( bo.getQuestionList() != null ) {
            List<Question> list1 = dto.getQuestionList();
            if ( list1 != null ) {
                bo.getQuestionList().clear();
                bo.getQuestionList().addAll( list1 );
            }
            else {
                bo.setQuestionList( null );
            }
        }
        else {
            List<Question> list1 = dto.getQuestionList();
            if ( list1 != null ) {
                bo.setQuestionList( new ArrayList<Question>( list1 ) );
            }
        }

        return bo;
    }
}
