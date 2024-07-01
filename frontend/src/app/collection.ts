import {User} from "./users";
import {Fanfic} from "./fanfic";

export interface Collection {
    id?: number;
    ownerId?: User;
    name?: string;
    description?: string;
    fanfics?: Fanfic[];
}
