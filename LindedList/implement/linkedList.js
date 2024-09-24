class Node {
    constructor(head, next, prev) {
        this.node = {
            head,
            next,
            prev,
        };
    }
}

class LinkedList {
    constructor() {
        this.store = {};
    }

    get() {
        return this.store;
    }

    add(el) {
        if (Object.keys(this.store).length === 0) {
            node = new Node(el,null,null);
            this.store = node;
        } else {
            
        }
    }
}

const ll = new LinkedList();
ll.add(2);
ll.add(3);
ll.add(4);
console.log(ll.get());
