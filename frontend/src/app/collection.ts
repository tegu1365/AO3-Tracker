import { Users } from "./user";
import { Fanfic } from "./fanfic";

export interface Fanfic {
    id: number;
    ownerId?: Users;
    name?: string;
    description?: string;
    fanfics?: Fanfic[];
}
