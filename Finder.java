package ru.esphere.school.service;

import ru.esphere.school.data.MembersGroup;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Finder {


    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */
//    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
//        Set<String> groupsNames = new HashSet<>();
//        for (MembersGroup membersGroup: groups) {
//           for(Member member: membersGroup.getMembers()) {
//               if (member.getAge() > targetAge) {
//                   String name = member.getName();
//                   groupsNames.add(name);
//               }
//           }
//        }
//        return groupsNames;
//    }
    /** Refactor
     *
     */
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {

        Set<String> groupsNames = new HashSet<>();
        groups.stream()
                .peek((membersGroup) ->
                    membersGroup.getMembers().stream()
                        .collect(Collectors
                            .filtering(member -> member.getAge() < targetAge)));

                  return groupsNames;
    }
}
