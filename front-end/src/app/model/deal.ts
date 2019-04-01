import { Tipooferta } from '../enum/tipooferta.enum';

export class Deal {
    constructor(
        id: number,
        text: string,
        createDate: Date,
        publishDate: Date,
        endDate: Date,
        url: string,
        totalSolid: number,
        type: Tipooferta
    ) {}
}