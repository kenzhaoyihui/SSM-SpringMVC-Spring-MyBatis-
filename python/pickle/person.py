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
