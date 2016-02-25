/*
 find celebrity.
 definition:
 everyone in the group knows celebrity.
 but celebrity don't know any of them.
 
 boolean knows(Person a, Person b){} // this will return true if a knows b. false if not. implemented.
 
 ArrayList<Person> people;
 
 
 [a, b, c ,d ,e]
 
 
 a b(celebrity) c d
 know()
 a -----> b
 \     / /
 >c <  /
 ^   /
 |  /
 d <
 */

n/2 + n/4 +   O(n)

H V

1 H <- V
2 V - V
3 V <- V
4 V -> V
5 V <-> V

mehtod(A, B) true -> 4,5 -> remove A
false -> 1,2,3 -> remove B

Person findCel(ArrayList<Person> people){
if(people.length == 1){return people[0]}
int cur = 0;

for(int i = cur+1 ; i < people.length; ++i){
if(knows(people[cur], people[i])){
cur = i;
continue;
}
}

for(int i = 0; i < people.length-1; ++i){
if(knows(people[cur], people[i])){ return null; }
}

for(int i = 0; i < people.length; ++i){
if(cur == i){ continue; } // skip same element
if(!knows(people[i], people[cur])){ // check if cur knows someone
return null;
}
}
return cur;
}



Person findCel(ArrayList<Person> people){
int j = 0;
while(j < people.length) {
if people(0) knows people(j)
for k=0 to people.length
if (people(k) knows people(j))
continue
else j++;
if people(j) not knows people(k)
continue
else j = k;
return person(j);
}
}

[b,a,t]

Person findCelebrity(ArrayList<Person> people){

if (people == null) { return null; }

outerloop:
for (int i = 0; i < people.length(); i++) {
for (int j = 0; j < people.length(); j++) {
if (i == j) { continue; }
if (knows(people.get(i), people.get(j)) || !knows(people.get(j), people.get(i)) ) {
break outerloop;
}
}
return people.get(i);
}

return null;
}





