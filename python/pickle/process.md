# Process

1. First -- person.py
```
> cat person.py
class Person(object):
    
    def __init__(self, firstname, lastname):
        self.firstname = firstname
        self.lastname = lastname
    
```

```
import cPickle as pickle
from person import Person

name = Person("Yihui", "Zhao")
f = file('temp.pkl', 'w')

p = pickle.dump(name, f)

f.close()

------------------------------
import cPickle as pickle

f1 = file('temp.pkl', 'r')
p = pickle.load(f1)

>p.firstname
Yihui

>p.lastname
Zhao

f1.close()
```

2. Second -- person.py

```
>cat person.py

class Person(object):
    """
    def __init__(self, firstname, lastname):
        self.firstname = firstname
        self.lastname = lastname
    """

    def __init__(self, fullname):
        self.fullname = fullname

    def __setstate__(self, state):
        if 'fullname' not in state:
            first =''
            last = ''

            if 'firstname' in state:
                first = state['firstname']
                del state['firstname']
            if 'lastname' in state:
                last = state['lastname']
                del state['lastname']
            self.fullname = "".join([first, last]).strip()
        self.__dict__.update(state)
```

```
import cPickle as pickle

f1 = file('temp.pkl', 'r')

p = pickle.load(f1)

>p.fullname
'YihuiZhao'

f1.close()

```
