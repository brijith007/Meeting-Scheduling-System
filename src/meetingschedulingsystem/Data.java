/*
 * Copyright (C) 2015 yehyaawad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package meetingschedulingsystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author yehyaawad
 */
public class Data implements Serializable {
    private final ArrayList<Room> rooms;
    private final ArrayList<Person> people;
    private final ArrayList<Meeting> meetings;

    public Data(ArrayList<Room> rooms, ArrayList<Person> people, ArrayList<Meeting> meetings) {
        this.rooms = rooms;
        this.people = people;
        this.meetings = meetings;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }
    
}
