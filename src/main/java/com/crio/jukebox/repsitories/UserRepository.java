package com.crio.jukebox.repsitories;

public class UserRepository  {

    // private final Map<String,User> userMap;
    // private Integer autoIncrement = 0;

    // public UserRepository(){
    //     userMap = new HashMap<String,User>();
    // }

    // public UserRepository(Map<String, User> userMap) {
    //     this.userMap = userMap;
    //     this.autoIncrement = userMap.size();
    // }

    // @Override
    // public User save(User entity) {
    //     if( entity.getId() == null ){
    //         autoIncrement++;
    //         User u = new User(Integer.toString(autoIncrement),entity.getName());
    //         userMap.put(u.getId(),u);
    //         return u;
    //     }
    //     userMap.put(entity.getId(),entity);
    //     return entity;
    // }
    // @Override
    // public List<User> findAll() {
    //  return userMap.values().stream().collect(Collectors.toList());
    // }

    // @Override
    // public Optional<User> findById(String id) {
    //     return Optional.ofNullable(userMap.get(id));
    // }

    // @Override
    // public boolean existsById(String id) {
    //     // TODO Auto-generated method stub
    //     if(userMap.containsKey(id)) return true;
    //     return false;
    // }

    // @Override
    // public void delete(User entity) {
    //     // TODO Auto-generated method stub
    //     if(userMap.containsKey(entity.getId())) userMap.remove(entity.getId());
        
    // }

    // @Override
    // public void deleteById(String id) {
    //     // TODO Auto-generated method stub
    //     if(userMap.containsKey(id)) userMap.remove(id);
    // }

    // @Override
    // public long count() {
    //     // TODO Auto-generated method stub
    //     return userMap.size();
    // }

    
    // @Override
    // public Optional<User> findByName(String name) {
    //  return userMap.values().stream().filter(c -> c.getName().equals(name)).findAny();
    // }
    
}
